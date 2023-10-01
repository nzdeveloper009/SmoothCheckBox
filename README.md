# SmoothCheckBox

### ScreenShot:

<img src="https://github.com/nzdeveloper009/SmoothCheckBox/blob/main/sample.gif?raw=true" width="50%" height="50%"/>

### Attrs
|attr|format|description|
|---|:---|:---:|
|duration|integer|animation duration|
|stroke_width|dimension|Border width when not selected|
|color_tick|color|Check color|
|color_checked|color|Fill color when selected|
|color_unchecked|color|Fill color when not selected|
|color_unchecked_stroke|color|Border color when not selected|


## Sample Usage


```Kotlin
    setChecked(boolean checked);                   // There is no animation by default, if animation is required, call the overloaded method.
    setChecked(boolean checked, boolean animate);  // Parameters: animate whether to display animation.
```


```Kotlin
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySampleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.scb.setOnCheckedChangeListener(object: SmoothCheckBox.OnCheckedChangeListener{
            override fun onCheckedChanged(checkBox: SmoothCheckBox?, isChecked: Boolean) {
                Log.d("SmoothCheckBox", "$isChecked")
            }
        })
    }    
```



## Steps to use features in the project:
> Step 1. Add the JitPack repository to your settings.gradle.kts file
```gradle
maven {
  name = "GithubPackages"
  url = uri("https://maven.pkg.github.com/nzdeveloper009/SmoothCheckBox")
  credentials {
    username = "nzdeveloper009"
    password = "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"
  }
}
```
> Step 2. Add the dependency
```gradle
dependencies {
  implementation("com.nzdeveloper:smoothcheckboxlibrary:0.9-alpha")
}
```
