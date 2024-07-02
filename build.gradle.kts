allprojects {
  group = properties["kuark.group"]!!
  version = properties["kuark.version"]!!
}

// 전체 패키지 지정
plugins {
  id("kuark-jvm")
}

dependencies {
  implementation(project(":kuark-text"))
  implementation(project(":kuark-secret"))
  implementation(project(":kuark-logging"))
}
