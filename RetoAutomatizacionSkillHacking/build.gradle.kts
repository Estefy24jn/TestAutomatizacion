plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    testImplementation("net.serenity-bdd:serenity-core:3.3.4")
    testImplementation("net.serenity-bdd:serenity-screenplay:3.3.4")
    testImplementation("net.serenity-bdd:serenity-junit5:3.3.4")
    testImplementation("org.seleniumhq.selenium:selenium-java:4.11.0")

    testImplementation("org.seleniumhq.selenium:selenium-java:4.11.0")

    testImplementation( "io.cucumber:cucumber-java:6.11.")

    testImplementation("net.serenity-bdd:serenity-cucumber:3.3.4")
}

tasks.test {
    useJUnitPlatform()
}