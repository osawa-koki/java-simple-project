plugins {
    id("java")
}

group = "org.example"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

tasks.register<Copy>("copyReport") {
  from(layout.buildDirectory.file("reports/my-report.pdf"))
  into(layout.buildDirectory.dir("toArchive"))
}

buildDir = File("./build")
