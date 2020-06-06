
buildscript {
    val springBootVersion: String by project

    repositories {
        repositories {
            maven {
                url = uri("https://repo.spring.io/plugins-snapshot")
            }
        }
    }
    dependencies {
        classpath("org.springframework.boot:spring-boot-gradle-plugin:${springBootVersion}")
    }
}

group = "com.alpeshvalia.greeting.application"
version = "0.0.1-SNAPSHOT"

plugins {
    java
}
apply {
    plugin("io.spring.dependency-management")
    plugin("org.springframework.boot")
}

repositories {
    jcenter()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation(project(":greeting-service"))
}