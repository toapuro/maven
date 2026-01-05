plugins {
    `maven-publish`
}

publishing {
    publications {
        create<MavenPublication>("modmetagradle1.20.1") {
            groupId = "io.github.toapuro.modmetagradle"
            artifactId = "modmetagradle"
            version = "1.0.0"
            artifact(file("artifacts/modmetagradle/modmetagradle-forge-1.0.0.jar"))
            artifact(file("artifacts/modmetagradle/modmetagradle-forge-sources-1.0.0.jar"))
            artifact(file("artifacts/modmetagradle/modmetagradle-neoforge-1.0.0.jar"))
            artifact(file("artifacts/modmetagradle/modmetagradle-neoforge-sources-1.0.0.jar"))
        }
    }

    repositories {
        maven {
            url = layout.buildDirectory.file("repo").get().asFile.toURI()
        }
    }
}
