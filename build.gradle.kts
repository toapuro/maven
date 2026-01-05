plugins {
    `maven-publish`
}

publishing {
    publications {
        create<MavenPublication>("modmetagradle1.0.0") {
            groupId = "io.github.toapuro.modmetagradle"
            artifactId = "modmetagradle"
            version = "1.0.0"
            artifact(file("artifacts/modmetagradle/modmetagradle-forge-1.0.0.jar")) {
                classifier = "forge"
            }
            artifact(file("artifacts/modmetagradle/modmetagradle-forge-1.0.0-sources.jar")) {
                classifier = "forge-sources"
            }
            artifact(file("artifacts/modmetagradle/modmetagradle-neoforge-1.0.0.jar")) {
                classifier = "neoforge"
            }
            artifact(file("artifacts/modmetagradle/modmetagradle-neoforge-1.0.0-sources.jar")) {
                classifier = "neoforge-sources"
            }
        }
    }

    repositories {
        maven {
            url = layout.buildDirectory.file("repo").get().asFile.toURI()
        }
    }
}
