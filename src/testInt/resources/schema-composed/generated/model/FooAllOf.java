/*
 * This class is auto generated by https://github.com/hauner/openapi-processor-spring.
 * DO NOT EDIT.
 */

package generated.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FooAllOf {

    @JsonProperty("one")
    private String one;

    @JsonProperty("two")
    private String two;

    @JsonProperty("three")
    private String three;

    public String getOne() {
        return one;
    }

    public void setOne(String one) {
        this.one = one;
    }

    public String getTwo() {
        return two;
    }

    public void setTwo(String two) {
        this.two = two;
    }

    public String getThree() {
        return three;
    }

    public void setThree(String three) {
        this.three = three;
    }

}