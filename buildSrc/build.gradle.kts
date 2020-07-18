plugins {
    `java-gradle-plugin`
    `kotlin-dsl`
    `kotlin-dsl-precompiled-script-plugins`
}

repositories {
    jcenter()
    gradlePluginPortal()
    maven ("https://dl.bintray.com/kotlin/kotlin-eap")
    maven ("https://kotlin.bintray.com/kotlinx")
}

dependencies {
    api(kotlin("gradle-plugin", version = "1.4-M3"))
    api("org.jetbrains.dokka:dokka-gradle-plugin:0.9.17")
    api("com.jfrog.bintray.gradle:gradle-bintray-plugin:1.8.4")
    api("gradle.plugin.org.jetbrains.intellij.plugins:gradle-intellij-plugin:0.4.10")
    api("com.github.jengelman.gradle.plugins:shadow:4.0.2")
}
