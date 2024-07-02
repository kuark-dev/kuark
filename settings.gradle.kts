rootProject.name = extra["kuark.artifactId"] as String

include(
  ":kuark-text",
  ":kuark-secret",
  ":kuark-logging",
)

for (child in rootProject.children) {
  child.projectDir = file("packages/${child.name}")
}
