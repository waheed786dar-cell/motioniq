# MotionIQ

**Adaptive Motion Optimization Engine for Android**

MotionIQ automatically detects device performance (RAM, CPU, thermal state, battery, refresh rate, live jank) and adapts your app's animations in real time — so you never have to hand-write separate animation logic for low-end and high-end phones.

[

![CI](https://github.com/waheed786dar-cell/motioniq/actions/workflows/ci.yml/badge.svg)

](https://github.com/waheed786dar-cell/motioniq/actions/workflows/ci.yml)
[

![License](https://img.shields.io/badge/license-Apache%202.0-blue.svg)

](LICENSE)

## Status

🚧 Under active development — Phase 8 of the build roadmap.

## Modules

| Module | Description |
|---|---|
| `motioniq-core` | Signal collection + Decision Engine (pure Kotlin, no Compose dependency) |
| `motioniq-compose` | Jetpack Compose adapters |
| `motioniq-views` | XML/View system adapters |
| `motioniq-debug` | Debug overlay (FPS, profile, thermal) — debug builds only |

## License

Apache 2.0 — see [LICENSE](LICENSE)
