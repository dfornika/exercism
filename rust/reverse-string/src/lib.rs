use unicode_segmentation::UnicodeSegmentation;

pub fn reverse(input: &str) -> String {
    let mut output = String::from("");
    let g = input.graphemes(true).collect::<Vec<&str>>();
    for s in g.iter().rev() {
        output.push_str(s);
    }
    output
}
