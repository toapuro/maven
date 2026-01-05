plugins {
    `maven-publish`
}

publishing {
    publications {
        create<MavenPublication>("addonapi_2.0.0") {
            groupId = "moffy.addonapi"
            artifactId = "addonapi"
            version = "2.0.0"
            artifact(file("artifacts/addonapi/addonapi-mc1.20.1-2.0.0-SNAPSHOT.jar"))
        }
    }

    repositories {
        maven {
            url = buildDir.resolve("repo").toURI()
        }
    }
}
