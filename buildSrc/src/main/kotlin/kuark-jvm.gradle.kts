import org.jetbrains.kotlin.gradle.dsl.JvmTarget

val javaVersion: String = libs.versions.java.get()

plugins {
  kotlin("jvm")
}

repositories {
  mavenCentral()
}

dependencies {
  compileOnly(libs.kotlin.stdlib)
  testImplementation(libs.kotlin.test)
}

kotlin {
  jvmToolchain(javaVersion.toInt())

  compilerOptions {
    jvmTarget = JvmTarget.fromTarget(javaVersion)
  }
}

tasks {
  test {
    useJUnitPlatform()
  }
}
