package in.shani.billingsoftware.service;

import in.shani.billingsoftware.io.OrderRequest;
import in.shani.billingsoftware.io.OrderResponse;

import java.util.List;

public interface OrderService {

    OrderResponse createOrder(OrderRequest request);

    void deleteOrder(String orderId);

    List<OrderResponse> getLatestOrders();

}
