package sia.tacocloud.tacos.repositories;

import sia.tacocloud.tacos.Order;

public interface OrderRepository {

    Order save(Order order);
}
