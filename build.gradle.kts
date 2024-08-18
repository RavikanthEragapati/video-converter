plugins {
    id("java")
}

group = "com.eragapati.karate.demo"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.apache.logging.log4j:log4j-core:2.23.1")
    implementation("org.apache.logging.log4j:log4j-api:2.23.1")
    testImplementation("org.slf4j:slf4j-log4j12:2.0.16")
    implementation("org.slf4j:jcl-over-slf4j:2.0.16")


    implementation("org.slf4j:slf4j-api:2.0.16")


    implementation(files("lib/xuggle-xuggler-5.4.jar"))

}

tasks.test {
    useJUnitPlatform()
}