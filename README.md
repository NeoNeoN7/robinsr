# RobinSR

A Server emulator for the game [`Honkai: Star Rail`](https://hsr.hoyoverse.com/en-us/)
![screenshot](https://git.xeondev.com/reversedrooms/RobinSR/raw/branch/master/screenshot.png)

## Installation

### From Source

#### Requirements

- [Rust](https://www.rust-lang.org/tools/install)

**NOTE**: Nightly Rust is required to build the project. To install it, first install
Rust itself, then run the following command:

```sh
rustup toolchain install nightly
rustup default nightly
```

#### Building

```sh
git clone https://git.xeondev.com/reversedrooms/RobinSR.git
cd RobinSR
cargo install --path gameserver
cargo install --path sdkserver
```

### From Pre-built Binaries

Navigate to the [Releases](https://git.xeondev.com/reversedrooms/RobinSR/releases)
page and download the latest release for your platform.

## Usage

To begin using the server, you need to run both the SDK server and the game server.

If you installed from source, Rust's installer should have added .cargo/bin to your
path, so simply run the following:

```sh
gameserver
sdkserver
```

If you installed from pre-built binaries, navigate to the directory where you downloaded
the binaries and either a) double-click on the following executable names or b)
run the following in a terminal:

```sh
./gameserver
./sdkserver
```

## Connecting
[Get 2.2 beta client](https://bhrpg-prod.oss-accelerate.aliyuncs.com/client/beta/20240322124944_scfGE0xJXlWtoJ1r/StarRail_2.1.51.zip),
replace [mhypbase.dll](https://git.xeondev.com/reversedrooms/RobinSR/raw/branch/master/mhypbase.dll) file in your game folder, it will redirect game traffic (and also disable in-game censorship)

## Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss
what you would like to change, and why.

## Bug Reports

If you find a bug, please open an issue with as much detail as possible. If you
can, please include steps to reproduce the bug.

Bad issues such as "This doesn't work" will be closed immediately, be _sure_ to
provide exact detailed steps to reproduce your bug. If it's hard to reproduce, try
to explain it and write a reproducer as best as you can.
