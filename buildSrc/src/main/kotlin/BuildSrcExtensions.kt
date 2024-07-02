import org.gradle.accessors.dm.LibrariesForLibs
import org.gradle.api.Project
import org.gradle.kotlin.dsl.DependencyHandlerScope
import org.gradle.kotlin.dsl.the

val Project.libs: LibrariesForLibs
  get() = the()

fun DependencyHandlerScope.implementation(dependency: Any) {
  add("implementation", dependency)
}

fun DependencyHandlerScope.compileOnly(dependency: Any) {
  add("compileOnly", dependency)
}

fun DependencyHandlerScope.testImplementation(dependency: Any) {
  add("testImplementation", dependency)
}
