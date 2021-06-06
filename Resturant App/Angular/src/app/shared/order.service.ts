import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Order } from './order.model';
import { OrderItem } from './order-item.model';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class OrderService {
  formData: Order;
  orderItems: OrderItem[];

  constructor(private http: HttpClient) { }

  saveOrUpdateOrder() {
    var body = {
      ...this.formData,
      orderItems: this.orderItems
    };
    return this.http.post(environment.apiURL + '/saveOrder', body);
  }

  getOrderList() {
    return this.http.get(environment.apiURL + '/orderList').toPromise();
  }

  getOrderByID(id:number):any {
    return this.http.get(environment.apiURL + '/Order/'+id).toPromise();
  }

  deleteOrder(id:number) {
    console.log("id",id);
    return this.http.delete(environment.apiURL + '/deleteOrder/'+id).toPromise();
  }

}
