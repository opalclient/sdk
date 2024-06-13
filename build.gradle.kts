plugins {
    `java-library`
    `maven-publish`
    id("fabric-loom") version "1.6-SNAPSHOT"
}

group = "wtf.opal"
version = "0.1-SNAPSHOT"


repositories {
    mavenCentral()
    maven(url = "https://jitpack.io")

}

val minecraftVersion: String by project
val yarnMappings: String by project

dependencies {
    minecraft("com.mojang:minecraft:${minecraftVersion}")
    mappings("net.fabricmc:yarn:${yarnMappings}:v2")
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

// Apply a specific Java toolchain to ease working on different environments.
java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

publishing {
    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/opalclient/sdk")
            credentials {
                username = System.getenv("GITHUB_ACTOR")
                password = System.getenv("GITHUB_TOKEN")
            }
        }
    }

    publications {
        register<MavenPublication>("gpr") {
            from(components["java"])
        }
    }
}

tasks.named<Test>("test") {
    // Use JUnit Platform for unit tests.
    useJUnitPlatform()
}
