plugins {
    `maven-publish`
}

publishing {
    publications {
//        create<MavenPublication>("addonapi_2.0.0") {
//            groupId = "moffy.addonapi"
//            artifactId = "addonapi"
//            version = "mc1.20.1-2.0.0-SNAPSHOT"
//            artifact(file("artifacts/addonapi/addonapi-mc1.20.1-2.0.0-SNAPSHOT.jar"))
//        }
    }

    repositories {
        maven {
            url = layout.buildDirectory.file("repo").get().asFile.toURI()
        }
    }
}
