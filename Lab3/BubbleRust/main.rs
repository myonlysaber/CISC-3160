fn main() {
    let mut arr: [i32; 7] = [76, 34, 44, 12, 15, 1, 2];

    println!("{:?}", arr);

    for _i in 0..arr.len() {
        for j in (0)..arr.len() - 1 {
            if arr[j] > arr[j + 1] {
                swap(&mut arr, j + 1, j)
            }
            //println!("{:?}", arr);     test
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
