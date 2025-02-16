package java.lang.annotation


@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.ANNOTATION_TYPE)
annotation class Retention(val value: RetentionPolicy)
