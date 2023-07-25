package main.com.pojo;
import java.util.List;
import java.util.Map;

/**
 * @author 齐阳
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Person
{
    private String name;
    private  String[] phone;
    private List<String> cities;
    private Map<String,Object> map;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String[] getPhone()
    {
        return phone;
    }

    public void setPhone(String[] phone)
    {
        this.phone = phone;
    }

    public List<String> getCities()
    {
        return cities;
    }

    public void setCities(List<String> cities)
    {
        this.cities = cities;
    }

    public Map<String,Object> getMap()
    {
        return map;
    }

    public void setMap(Map<String,Object> map)
    {
        this.map = map;
    }

    @Override
    public String toString()
    {
        return "Person{" + "name=" + name + ", phone='" + phone + '\'' + ", cities=" + cities + ", map=" + map + '}';
    }

    public Person(String name,String[] phone,List<String> cities,Map<String,Object> map)
    {
        this.name = name;
        this.phone = phone;
        this.cities = cities;
        this.map = map;
    }

    public Person()
    {
    }
}
