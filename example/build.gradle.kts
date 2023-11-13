plugins {
    id("org.jetbrains.kotlin.jvm") version "1.9.10"
    id("io.gitlab.arturbosch.detekt") version "1.17.1"
    `java-library`
}

repositories {
    mavenCentral()
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}
