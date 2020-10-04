fn main() {
    let mut arr: [i32; 7] = [76, 34, 44, 12, 15, 1, 6];

    println!("{:?}", arr);

    for i in 0..arr.len() {
        for j in i + 1..arr.len() {
            if arr[j] < arr[i] {
                swap(&mut arr, i, j);
            }
            //println!("{:?}", arr); test
        }
    }
    println!("{:?}", arr);
}
fn swap(arr: &mut [i32; 7], i: usize, j: usize) {
    let temp: i32;

    temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
