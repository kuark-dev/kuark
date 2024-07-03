plugins {
  `kotlin-dsl`
}

repositories {
  gradlePluginPortal()
  mavenCentral()
}

dependencies {
  implementation(libs.gradlePlugin.kotlin)
  implementation(libs.gradlePlugin.kotlin.allOepn)

  implementation(libs.gradlePlugin.spring.boot)
  implementation(libs.gradlePlugin.spring.dependencyManagement)

  // https://github.com/gradle/gradle/issues/15383
  implementation(files(libs.javaClass.superclass.protectionDomain.codeSource.location))
}
