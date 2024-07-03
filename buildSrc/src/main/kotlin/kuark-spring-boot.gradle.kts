plugins {
  kotlin("plugin.spring")

  id("org.springframework.boot")
  id("io.spring.dependency-management")
}

dependencies {
  compileOnly(libs.spring.boot.starter)

  developmentOnly(libs.spring.boot.devtools)
  testImplementation(libs.spring.boot.starter.test)
}
