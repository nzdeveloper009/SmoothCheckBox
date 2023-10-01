pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven {
            name = "GithubPackages"
            url = uri("https://maven.pkg.github.com/nzdeveloper009/SmoothCheckBox")
            credentials {
                /*username = System.getenv("GITHUB_USER_NAME")
                password = System.getenv("GITHUB_TOKEN")*/
                username = "nzdeveloper009"
                password = "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"
            }
        }
    }
}

rootProject.name = "SmoothCheckBox"
include(":app")
include(":SmoothCheckBoxLibrary")
