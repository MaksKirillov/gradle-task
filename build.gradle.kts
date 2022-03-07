/*
 * This file was generated by the Gradle 'init' task.
 *
 * This is a general purpose Gradle build.
 * Learn more about Gradle by exploring our samples at https://docs.gradle.org/7.2/samples
 */

    plugins {
        id("org.jetbrains.kotlin.jvm") version "1.6.10"
    }

    repositories {
        mavenCentral()
    }

    dependencies {

        implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.6.10")

        implementation("com.google.guava:guava:31.0.1-jre")

        testImplementation("org.jetbrains.kotlin:kotlin-test-junit5:1.6.10")
    }

    tasks.test {
    useJUnitPlatform()
    }
