plugins {
  id("kuark-jvm")
}

dependencies {
  implementation(libs.slf4j.api)
  runtimeOnly(libs.logback.classic)
}
