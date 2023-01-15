plugins {
    kotlin("js")
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    api(project(":kotlin-browser"))
    api(project(":kotlin-history"))

    api(npmv("@remix-run/router"))
}
