package Steps;

import io.cucumber.java.ParameterType;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ParameterTypes {
    
    @ParameterType(".*")
    public List<String> foodItems(String foodItems) {
        return Arrays.stream(foodItems.split(","))
                     .map(String::trim)
                     .collect(Collectors.toList());
    }
}
