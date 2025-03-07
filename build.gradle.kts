plugins {
    kotlin("jvm") version "2.1.10"
}

group = "com"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation(libs.bundles.flink)
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}