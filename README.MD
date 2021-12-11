该 demo 演示了模块化/在组件化开发的基本架构和跳转实现。

参考理论文章：

1. [Android组件化/模块化开发 01](https://www.jianshu.com/p/748bf621a9a0)
2. [Android组件化/模块化开发 02](https://www.jianshu.com/p/bfd5afed498f)

其中，模块内跳转使用了 Navigation，模块间跳转使用了深度链接（deepLink）

```xml
<fragment
        android:id="@+id/featureOneFragment"
        android:name="com.xzy.demo.feature.FeatureOneFragment"
        android:label="featrueOneFragment"
        tools:layout="@layout/fragment_feature1">
        <action
            android:id="@+id/action_featureOneFragment_to_fragmentTwoFragment"
            app:destination="@id/fragmentTwoFragment" />
        <deepLink app:uri="http://www.xzy.com/app/feature/a" />
    </fragment>
```

跳转时使用的 deepLink 方法：

```kotlin
fun jumpToOtherModule(activity:Activity?,uri: String) {
    val intent = Intent()
    intent.data = Uri.parse(uri)
    intent.setPackage(activity?.packageName)
    activity?.startActivity(intent)
}
```

调用：

```kotlin
jumpToOtherModule(requireActivity(), "http://www.xzy.com/app/feature/a")
```

