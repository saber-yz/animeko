fork于https://github.com/open-ani/animeko/，仅用于学习，请支持原作者
<div align="center">

![Animeko](https://socialify.git.ci/open-ani/animeko/image?description=1&descriptionEditable=%E9%9B%86%E6%89%BE%E7%95%AA%E3%80%81%E8%BF%BD%E7%95%AA%E3%80%81%E7%9C%8B%E7%95%AA%E7%9A%84%E4%B8%80%E7%AB%99%E5%BC%8F%E5%BC%B9%E5%B9%95%E8%BF%BD%E7%95%AA%E5%B9%B3%E5%8F%B0&font=Jost&logo=https%3A%2F%2Fraw.githubusercontent.com%2Fopen-ani%2Fanimeko%2Frefs%2Fheads%2Fmain%2F.github%2Fassets%2Flogo.png&name=1&owner=1&pattern=Plus&theme=Light)


</div>

[dmhy]: http://www.dmhy.org/

[Bangumi]: http://bangumi.tv

[ddplay]: https://www.dandanplay.com/

[Compose Multiplatform]: https://www.jetbrains.com/compose-multiplatform/

[acg.rip]: https://acg.rip

[Mikan]: https://mikanani.me/

[Ikaros]: https://ikaros.run/

[Kotlin Multiplatform]: https://kotlinlang.org/docs/multiplatform.html

[ExoPlayer]: https://developer.android.com/media/media3/exoplayer

[VLC]: https://www.videolan.org/vlc/

[libtorrent]: https://libtorrent.org/

Animeko 支持云同步观看记录 ([Bangumi][Bangumi])、多视频数据源、缓存、弹幕、以及更多功能，提供尽可能简单且舒适的追番体验。

> Animeko 曾用名 Ani，现在也简称 Ani。


## 主要功能

### 浏览来自 [Bangumi][Bangumi] 的番剧信息以及社区评价

| <img src=".readme/images/features/subject-details.png" alt="" width="200"/> | <img src=".readme/images/features/subject-rating.png" alt="" width="200"/> | 
|:---------------------------------------------------------------------------:|:--------------------------------------------------------------------------:|

### 丰富的检索方式：新番时间表、标签搜索

> 由 Bangumi 和 Animeko 服务端共同提供的精确新番时间表

| <img src=".readme/images/features/anime-schedule.png" alt="" width="200"/> | <img src=".readme/images/features/search-by-tag.png" alt="" width="200"/> | 
|:--------------------------------------------------------------------------:|:-------------------------------------------------------------------------:|

### 云同步追番进度

- 省心的追番进度管理，看完视频自动更新进度
- 打开 APP 立即继续观看，无需回想上次看到了哪

| <img src=".readme/images/features/subject-collection.png" alt="" width="200"/> | <img src=".readme/images/features/home.png" alt="" width="200"/> | 
|:------------------------------------------------------------------------------:|:----------------------------------------------------------------:|

### 聚合数据源

- 聚合视频数据源，全自动选择
  > 还支持 BitTorrent、Jellyfin、Emby、以及自定义源
- 聚合全网弹幕源（[弹弹play][ddplay]），以及 Animeko 自己的[弹幕服务](https://danmaku-cn.myani.org/swagger/index.html)

| <img src=".readme/images/features/mediaselector-simple.png" alt="" width="200"/> | <img src=".readme/images/features/mediaselector-detailed.png" alt="" width="200"/> |
|:--------------------------------------------------------------------------------:|:----------------------------------------------------------------------------------:|

| <img src=".readme/images/features/episode.png" alt="" width="200"/> | <img src=".readme/images/features/episode-scrolled.png" alt="" width="200"/> |
|:-------------------------------------------------------------------:|:----------------------------------------------------------------------------:|

### 离线缓存

- 所有数据源都能缓存

| <img src=".readme/images/features/cache-episode.png" alt="" width="200"/> | <img src=".readme/images/features/cache-list.png" alt="" width="200"/> |
|:-------------------------------------------------------------------------:|:----------------------------------------------------------------------:|

### 精美界面

| <img src=".readme/images/features/player-fullscreen.png" alt="" width="600"/> |
|:-----------------------------------------------------------------------------:|

- 适配平板和大屏设备

| <img src=".readme/images/features/pc-home.png" alt="" width="600"/> |
|:-------------------------------------------------------------------:|

| <img src=".readme/images/features/pc-search.png" alt="" width="600"/> |
|:---------------------------------------------------------------------:|

| <img src=".readme/images/features/pc-search-detail.png" alt="" width="600"/> |
|:----------------------------------------------------------------------------:|

### 更多个性设置

| <img src=".readme/images/features/danmaku-settings.png" alt="" width="600"/> |
|:----------------------------------------------------------------------------:|

| <img src=".readme/images/features/theme-settings.png" alt="" width="200"/> | <img src=".readme/images/features/media-preferences.png" alt="" width="200"/> |
|:--------------------------------------------------------------------------:|:-----------------------------------------------------------------------------:|


## 技术总览

如果你是开发者，我们总是欢迎你提交 PR 参与开发！
以下几点可以给你一个技术上的大概了解。

- [Kotlin 多平台][Kotlin Multiplatform]架构；
- 使用新一代响应式 UI 框架 [Compose Multiplatform][Compose Multiplatform] 构建
  UI；
- 内置专为 Animeko 打造的“基于 [libtorrent][libtorrent] 的 BitTorrent 引擎，优化边下边播的体验；
- 高性能弹幕引擎，公益弹幕服务器 + 网络弹幕源；
- 适配多平台的[视频播放器](https://github.com/open-ani/mediamp)，Android 底层为 [ExoPlayer][ExoPlayer]，PC 底层为 [VLC][VLC]；
- 多类型数据源适配，内置 [动漫花园][dmhy]、[Mikan]，拥有强大的自定义数据源编辑器和自动数据源选择器。

## FAQ

### 资源来源是什么?

全部视频数据都来自网络, Animeko 本身不存储任何视频数据。
Animeko 支持两大数据源类型：BT 和在线。BT 源即为公共 BitTorrent P2P 网络，
每个在 BT
网络上的人都可分享自己拥有的资源供他人下载。在线源即为其他视频资源网站分享的内容。Animeko
本身并不提供任何视频资源。

本着互助精神，使用 BT 源时 Animeko 会自动做种 (分享数据)。
BT 指纹为 `-AL4123-`，其中 `4123` 为版本号 `4.12.3`；UA 为类似 `ani_libtorrent/4.12.3`。

### 弹幕来源是什么?

Animeko 拥有自己的公益弹幕服务器，在 Animeko 应用内发送的弹幕将会发送到弹幕服务器上。每条弹幕都会以
Bangumi
用户名绑定以防滥用（并考虑未来增加举报和屏蔽功能）。

Animeko 还会从[弹弹play][ddplay]获取关联弹幕，弹弹play还会从其他弹幕平台例如哔哩哔哩港澳台和巴哈姆特获取弹幕。
番剧每集可拥有几十到几千条不等的弹幕量。
