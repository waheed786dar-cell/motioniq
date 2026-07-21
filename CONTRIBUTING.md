# Contributing to MotionIQ

Thanks for considering a contribution!

## Development Setup

1. Clone the repo: `git clone git@github.com:waheed786dar-cell/motioniq.git`
2. Open in Android Studio (Ladybug or newer) or build via CLI: `./gradlew build`
3. Run tests: `./gradlew test`
4. Run static analysis: `./gradlew detektAll ktlintCheck`
5. Check binary compatibility: `./gradlew apiCheck`

## Pull Request Guidelines

- One logical change per PR.
- All new public API must have KDoc comments.
- Public API changes require running `./gradlew apiDump` and committing the updated `.api` files.
- All CI checks (build, test, detekt, ktlint, apiCheck) must pass before merge.
- Follow the existing code style — enforced automatically via ktlint.

## Commit Convention

We use [Conventional Commits](https://www.conventionalcommits.org/):

- `feat:` new feature
- `fix:` bug fix
- `docs:` documentation only
- `refactor:` code change that neither fixes a bug nor adds a feature
- `test:` adding or correcting tests
- `chore:` build process or tooling changes

## Branch Strategy

- `main` — always releasable
- `feature/*` — new features, PR into `main`
- `fix/*` — bug fixes, PR into `main`

## Reporting Bugs

Please use the Bug Report issue template and include:
- Device model + Android version
- MotionIQ version
- Minimal reproduction steps
- Expected vs actual behavior
