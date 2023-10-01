plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("maven-publish")
}

android {
    namespace = "com.nzdeveloper.smoothcheckboxlibrary"
    compileSdk = 33

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    publishing {
        singleVariant("release") {
            withSourcesJar()
            withJavadocJar()
        }
        singleVariant("debug"){
            withSourcesJar()
            withJavadocJar()
        }
    }
}

configure<PublishingExtension> {
    publications.create<MavenPublication>("SmoothCheckbox") {
        groupId = "com.nzdeveloper"
        artifactId = "smoothcheckboxlibrary"
        version = "0.9-alpha"
        artifact("$buildDir/outputs/aar/SmoothCheckBoxLibrary-release.aar")

    }
    repositories {
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


dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}