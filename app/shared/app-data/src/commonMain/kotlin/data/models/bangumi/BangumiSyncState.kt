/*
 * Copyright (C) 2024-2025 OpenAni and contributors.
 *
 * 此源代码的使用受 GNU AFFERO GENERAL PUBLIC LICENSE version 3 许可证的约束, 可以在以下链接找到该许可证.
 * Use of this source code is governed by the GNU AGPLv3 license, which can be found at the following link.
 *
 * https://github.com/open-ani/ani/blob/main/LICENSE
 */

package me.him188.ani.app.data.models.bangumi

sealed interface BangumiSyncState {
    val value: Long
    val finished: Boolean get() = false

    data object Started : BangumiSyncState {
        override val value: Long = 0x0001_0000_0000_0000L
    }

    data class Fetched(val fetchedCount: Int) : BangumiSyncState {
        override val value: Long = 0x0002_0000_0000_0000L or fetchedCount.toLong()
    }

    data class Saved(val savedCount: Int) : BangumiSyncState {
        override val value: Long = 0x0003_0000_0000_0000L or savedCount.toLong()
    }

    data object SyncingTimeline : BangumiSyncState {
        override val value: Long = 0x0004_0000_0000_0000L
    }

    data object Finished : BangumiSyncState {
        override val value: Long = 0x0005_0000_0000_0000L
        override val finished: Boolean
            get() = true
    }

    companion object {
        fun fromRaw(value: Long): BangumiSyncState {
            val type = ((value and 0x0FFF_0000_0000_0000L) ushr 48).toInt()
            val value = (value and 0x0000_0000_FFFF_FFFF).toInt()

            return when (type) {
                0x0001 -> Started
                0x0002 -> Fetched(value)
                0x0003 -> Saved(value)
                0x0004 -> SyncingTimeline
                0x0005 -> Finished
                else -> throw IllegalArgumentException("Unknown SyncState type: $type")
            }
        }
    }
}