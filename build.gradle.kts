plugins {
    `maven-publish`
}

publishing {
    publications {
        create<MavenPublication>("modmetagradle1.0.0") {
            groupId = "io.github.toapuro.modmetagradle"
            artifactId = "modmetagradle"
            version = "1.0.0"
            artifact(file("artifacts/modmetagradle/modmetagradle-forge-1.0.0.jar"))
            artifact(file("artifacts/modmetagradle/modmetagradle-forge-1.0.0-sources.jar"))
            artifact(file("artifacts/modmetagradle/modmetagradle-neoforge-1.0.0.jar"))
            artifact(file("artifacts/modmetagradle/modmetagradle-neoforge-1.0.0-sources.jar"))
        }
    }

    repositories {
        maven {
            url = layout.buildDirectory.file("repo").get().asFile.toURI()
        }
    }
}
