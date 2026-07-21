plugins {
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.compose.compiler) apply false
    alias(libs.plugins.detekt)
    alias(libs.plugins.ktlint) apply false
    alias(libs.plugins.dokka)
    id("jacoco")
}

subprojects {
    apply(plugin = "org.jlleitschuh.gradle.ktlint")
    apply(plugin = "jacoco")

    configure<JacocoPluginExtension> {
        toolVersion = "0.8.12"
    }
}

tasks.register("detektAll") {
    dependsOn(subprojects.map { "${it.path}:detekt" })
}

tasks.register("jacocoTestReport") {
    dependsOn(subprojects.map { "${it.path}:test" })
}
