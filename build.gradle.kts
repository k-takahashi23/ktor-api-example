plugins {
  id("org.jetbrains.kotlin.jvm") version "1.5.0"
  id("org.jetbrains.kotlin.plugin.serialization") version "1.5.0"
  id("application")
}

group = "org.example"
version = "1.0-SNAPSHOT"
repositories {
  mavenCentral()
}

application {
  mainClass.set("ktorApiExample.AppKt")
}

dependencies {
  implementation("org.jetbrains.kotlin:kotlin-stdlib")
  implementation("org.kodein.di:kodein-di-framework-ktor-server-jvm:7.3.1")
  implementation("io.ktor:ktor-server-core:1.5.4")
  implementation("io.ktor:ktor-server-netty:1.5.4")
  implementation("io.ktor:ktor-serialization:1.5.4")
  implementation("ch.qos.logback:logback-classic:1.2.3")
}