plugins {
    id("java")
    id("jacoco")
    id("org.sonarqube") version "5.1.0.4882"
}

group = "com.keith"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

tasks.jacocoTestReport {
    dependsOn(tasks.test)
    reports {
        xml.required = true
    }
}

dependencies {
    compileOnly("org.projectlombok:lombok:1.18.34")
    annotationProcessor("org.projectlombok:lombok:1.18.34")
    testImplementation(platform("org.junit:junit-bom:5.10.3"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.hamcrest:hamcrest:3.0")
}

sonar {
    properties {
        property("sonar.projectKey", "KeithRobertson_Kata")
        property("sonar.host.url", "https://sonarcloud.io/")
    }
}

tasks.test {
    useJUnitPlatform()
}