plugins {
    id("java")
}

group = "org.example.webprog26"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    implementation("org.json:json:20240205")
}

tasks.test {
    useJUnitPlatform()
}