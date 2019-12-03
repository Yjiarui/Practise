public class Partition {
    public ListNode partition(ListNode phead,int x){
       if (phead == null){
           return null;
       }
       ListNode cur = phead;
        ListNode beforeStart = null;
        ListNode beforeEnd = null;
        ListNode afterStart = null;
        ListNode afterEnd = null;
        while (cur != null){
           ListNode curNext = cur.next;
           cur.next = null;
           if (cur.val < x){
               if (beforeStart == null){
                  beforeStart = cur;
                  beforeEnd = cur;
               }else {
                   beforeEnd.next = cur;
                   beforeEnd = cur;
               }
           }else {
               if (afterStart == null){
                   afterStart = cur;
                   afterEnd = cur;
               }else {
                   afterEnd.next = cur;
                   afterEnd = cur;
               }
           }
           cur = curNext;
        }
        if (beforeStart == null){
            return afterStart;
        }
        beforeEnd.next = afterStart;
        return beforeStart;
    }
}
