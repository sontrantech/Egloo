buildscript {
    extra["androidMinSdkVersion"] = 18
    extra["androidCompileSdkVersion"] = 29
    extra["androidTargetSdkVersion"] = 29

    repositories {
        google()
        mavenCentral()
        jcenter()
    }

    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.0")
        // change gradle build version to 2.2.3 to make sure it's usable in older projects
        classpath("com.android.tools.build:gradle:2.2.3")
        classpath("com.otaliastudios.tools:publisher:0.3.3")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        jcenter()
        maven("https://dl.bintray.com/natario/multiplatform")
    }
}

tasks.register("clean", Delete::class) {
    delete(buildDir)
}