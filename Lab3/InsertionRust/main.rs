fn main() {
    let mut arr: [i32; 7] = [76, 34, 44, 12, 15, 1, 4];
    println!("{:?}", arr);
    insertion_sort(&mut arr);

    println!("{:?}", arr);
}

fn insertion_sort(arr: &mut [i32; 7]) {
    for _i in 1..arr.len() {
        let mut j = _i;

        while j > 0 && arr[j - 1] > arr[j] {
            arr.swap(j - 1, j);
            j = j - 1;
        }
        //println!("{:?}", arr);   test
    }
}
