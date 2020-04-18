plugins {
    kotlin("js")
    `publishing-conventions`
}

dependencies {
    implementation(project(":kotlin-extensions"))
    implementation(project(":kotlin-css"))
    implementation(project(":kotlin-react"))
    implementation(project(":kotlin-react-dom"))

    implementation(npm("css-in-js-utils", "^3.0.4"))
    implementation(npm("inline-style-prefixer", "^5.1.2"))
    implementation(npm("styled-components", "^5.0.1"))
}
