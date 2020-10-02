---
layout: page
title: "Changelog"
order: 3
---

From version v0.5.3-noandroidx-rc1  androidx is removed in the library and demo project to support the projects that chosen to not convert to AndroidX.

New versions are released through GitHub, so the reference page is the [GitHub Releases](https://github.com/natario1/Egloo/releases) page.

This project is mostly based on natario1's Egloo, starting from v0.3.1, you can [support his development](https://github.com/sponsors/natario1) through the GitHub Sponsors program. 
Companies can share a tiny part of their revenue and get private support hours in return. Thanks!

### v0.5.3-noandroidx-rc1

- Downgrade gradle build version to v2.2.3
- Use exoplayer v2.9.6 in demo project
- Use annotation from android support library instead of AndroidX

<https://github.com/natario1/Egloo/compare/v0.5.3-noandroidx-rc1...v0.5.3>

### v0.5.3

- New: Upgrade to Kotlin 1.4 ([#27][27])
- New: Add a few getters to GlTexture and GlSharedStorageBuffer ([#27][27])

<https://github.com/natario1/Egloo/compare/v0.5.2...v0.5.3>

### v0.5.2

- Fix: fixed a bug with the Android/JVM implementation ([#23][23])

<https://github.com/natario1/Egloo/compare/v0.5.1...v0.5.2>

### v0.5.1

Native targets are now published to JCenter and can be added as dependencies from Kotlin Multiplatform
projects ([#22][22]). You can add the granular dependencies:

```kotlin
implementation("com.otaliastudios.opengl:egloo-android:0.5.1") // android
implementation("com.otaliastudios.opengl:egloo-androidnativex86:0.5.1") // android native
implementation("com.otaliastudios.opengl:egloo-androidnativex64:0.5.1") // android native
implementation("com.otaliastudios.opengl:egloo-androidnativearm32:0.5.1") // android native
implementation("com.otaliastudios.opengl:egloo-androidnativearm64:0.5.1") // android native
```

Or simply add the common dependency for your Kotlin Multiplatform common source set:

```kotlin
// This will include the correct artifact into your targets
implementation("com.otaliastudios.opengl:egloo-multiplatform:0.5.1")
```

<https://github.com/natario1/Egloo/compare/v0.5.0...v0.5.1>

### v0.5.0

This release adds support for native targets. We provide an implementation for Android native libraries,
but other targets like iOS can probably be added easily. These artifacts are not currently published
but can be built using `./gradlew :library:publishLocal` ([#20][20]).

Other changes:

- New: `EglCore.makeCurrent()` to make the context current with no surfaces ([#18][18])
- New: `GlBuffer` base class, and `GlShaderStorageBuffer` implementation for SSBOs
- New: `GlShader` abstraction for `GlProgram`s

<https://github.com/natario1/Egloo/compare/v0.4.0...v0.5.0>

### v0.4.0

- New: `GlTexture` class to create textures ([#14][14])
- New: `GlFramebuffer` class to create framebuffers ([#14][14])
- New: `Gl2dMesh` drawable ([#14][14])

<https://github.com/natario1/Egloo/compare/v0.3.1...v0.4.0>

### v0.3.1

First versioned release.

[natario1]: https://github.com/natario1

[14]: https://github.com/natario1/Egloo/pull/14
[18]: https://github.com/natario1/Egloo/pull/18
[20]: https://github.com/natario1/Egloo/pull/20
[22]: https://github.com/natario1/Egloo/pull/22
[23]: https://github.com/natario1/Egloo/pull/23
