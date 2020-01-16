import org.gradle.api.Plugin
import org.gradle.api.Project

class TestPlugin2 implements Plugin<Project> {
  @Override
  void apply(Project project) {
    project.task('pluginTest2') {
      println '2222222222222211111'
      doLast {
        println '22222222222222222222222222222222Hello World'
      }
    }
  }
}
