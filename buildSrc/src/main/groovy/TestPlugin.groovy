import org.gradle.api.Plugin
import org.gradle.api.Project

class TestPlugin implements Plugin<Project> {
  @Override
  void apply(Project project) {
    project.task('pluginTest') {
      println 'TestPluginTestPluginTestPluginTestPlugin'
      doLast {
//        println '22222222222Hello World'
      }
    }
  }
}
