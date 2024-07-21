plugins {
  `kotlin-dsl`
}

repositories {
  maven {
    url = uri("http://zmq:8081/repository/mvn-group/")
    isAllowInsecureProtocol = true
    credentials {
      username = (System.getenv("NEXUS_USERNAME"))
      password = (System.getenv("NEXUS_PASSWORD"))
    }
  }
  mavenLocal()
}

dependencies {
  implementation("com.diffplug.spotless:spotless-plugin-gradle:6.20.0")
}
