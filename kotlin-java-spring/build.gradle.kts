import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version "2.7.0"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    id("java")
    id("org.jetbrains.kotlin.jvm") version "1.9.0"
    kotlin("plugin.spring") version "1.9.0"
    kotlin("plugin.jpa") version "1.9.0"

//    kotlin("plugin.noarg") version "1.9.0"
//    id("org.jetbrains.kotlin.plugin.allopen") version "1.9.0"
}

//noArg {
//    annotation("javax.persistence.Entity")
//}

//allOpen {
//    annotations("org.springframework.boot.autoconfigure.SpringBootApplication",
//        "org.springframework.transaction.annotation.Transactional")
//}

group = "com.fastcampus"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    runtimeOnly("com.h2database:h2")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}