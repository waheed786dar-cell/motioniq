pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "motioniq"

include(
    ":motioniq-core",
    ":motioniq-compose",
    ":motioniq-views",
    ":motioniq-debug",
    ":motioniq-testing",
    ":benchmark",
    ":sample"
)
