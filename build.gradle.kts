plugins {
  id("org.jetbrains.kotlin.jvm") version "1.4.10"
  id("application")
}

group = "org.example"
version = "1.0-SNAPSHOT"
repositories {
  mavenCentral()
}

application {
  mainClass.set("org.example.crudApi.app.AppKt")
}

dependencies {
  implementation("org.jetbrains.kotlin:kotlin-stdlib")
  implementation("io.ktor:ktor-server-core:1.5.3")
  implementation("io.ktor:ktor-server-netty:1.5.3")
  implementation("io.ktor:ktor-serialization:1.5.3")
  implementation("ch.qos.logback:logback-classic:1.2.3")
}

tasks.wrapper<Wrapper> {
  gradleVersion = "6.8.3"
}